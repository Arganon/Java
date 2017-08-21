package hw.stones.forms;

public class Forms {
	public static String chainForm = "<!DOCTYPE html>\n" + 
			"<html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Insert title here</title>\n" + 
			"</head>\n" + 
			"<body>\n" + 
			"	<form method = \"GET\" action = \"NecklaceServlet\">\n" + 
			"		<table>\n" + 
			"			<tr>\n" + 
			"				<td>Necklace Maker</td>\n" + 
			"			</tr>\n" + 
			"			<tr>\n" + 
			"				<td>Choose chain material: </td>\n" + 
			"				<td>\n" + 
			"					<select value = \"chainMaterial\">\n" + 
			"						<option selected value = \"gold\">Gold</option>\n" + 
			"						<option value = \"whiteGold\">White Gold</option>\n" + 
			"						<option value = \"Silver\">Silver</option>\n" + 
			"					</select>\n" + 
			"				</td>\n" + 
			"			</tr>\n" +
			"			<tr>\n" +
			"				<td align = " + "right" + " colspan = " + "2" + ">\n" +
			"<input type = \"submit\" value = \"Confirm\"\n" +
			"</td>\n" +
			"</tr>\n" +
			"		</table>\n" + 
			"	</form>\n" + 
			"\n" + 
			"</body>\n" + 
			"</html>";
	
	
	public static String preciousStoneForm = "<!DOCTYPE html>\n" + 
			"<html>\n<head>\n<meta charset=\"UTF-8\">\n<title>Insert title here</title>\n" + 
			"</head>\n" + 
			"<body>\n" + 
			"	<form method = \"GET\" action = \"NecklaceServlet\">\n" + 
			"		<table>\n" + 
			"			<tr>\n" + 
			"				<td>Necklace Maker</td>\n" + 
			"			</tr>\n" + 
			"			<tr>\n" + 
			"				<td>Choose precious stone: </td>\n" + 
			"				<td>\n" + 
			"					<select value = \"stone\">\n" + 
			"						<option selected value = \"diamond\">Diamond</option>\n" + 
			"						<option value = \"emerald\">Emerald</option>\n" + 
			"						<option value = \"ruby\">Ruby</option>\n" +
			"						<option value = \"sapphire\">Sapphire</option>\\n" +
			"					</select>\n" + 
			"				</td>\n" + 
			"			</tr>\n" +
			"			<tr>\n" +
			"				<td align = " + "right" + " colspan = " + "2" + ">\n" +
			"<input type = \"submit\" value = \"Confirm\"\n" +
			"</td>\n" +
			"</tr>\n" +
			"		</table>\n" + 
			"	</form>\n" + 
			"\n" + 
			"</body>\n" + 
			"</html>";	
	
}
