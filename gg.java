public boolean isSpecial(String text) {
String tempText = alterText(text);
return text.equals(tempText);
}

public String alterText(String inputText) {
if(inputText == null || inputText.isEmpty()) {
return inputText;
}
return inputText.charAt(inputText.length() - 1) +
alterText(inputText.substring(0, inputText.length() - 1));
}