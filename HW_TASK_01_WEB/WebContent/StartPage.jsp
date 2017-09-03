<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>


<body>
	<form method = "GET" action = "NecklaceServlet">
		<table>
			<tr>
				<td>Please, choose type of stone</td>
				<td>
					<select name = "stoneSelect" onChange = "SelectedStoneType(this)">
						<option selected value = "Precious">Precious</option>
						<option value = "SemiPrecious">Semi Precious</option>
					</select>
				</td>
			</tr>
		</table>
		<div id="SemiPreciousBlock" style = "display: none">	
			<table>
				<tr>
					<td>Choose semi precious stone</td>
					<td>
						<select name = "semiPreciousStone">
							<option value = "AMBER">Amber</option>
							<option value = "RHINESTONE">Rhinestone</option>
							<option value = "AGATE">Agate</option>
							<option value = "LABRADOR">Labrador</option>
							<option value = "OBSIDIAN">Obsidian</option>
							<option value = "HELIOTROPE">Heliotrope</option>
							<option value = "RHODONITE">Rhodonite</option>
						</select>
					</td>
				</tr>
			</table>
		</div>
		<div id="PreciousBlock" style = "display: block">	
			<table>
				<tr>
					<td>Choose precious stone</td>
					<td>
						<select name = "preciousStone">
							<option value = "brilliant">Brilliant</option>
							<option value = "ruby">Ruby</option>
							<option value = "sapphire">Sapphire</option>
							<option value = "emerald">Emerald</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Choose clarity</td>
					<td>
						<select name = "clarity">
							<option value = "FL">FL</option>
							<option value = "IF">IF</option>
							<option value = "VVS1">VVS1</option>
							<option value = "VVS2">VVS2</option>
							<option value = "VS1">VS1</option>
							<option value = "VS2">VS2</option>
							<option value = "Si1">Si1</option>
							<option value = "Si2">Si2</option>
							<option value = "I1">I1</option>
							<option value = "I2">I2</option>
							<option value = "I3">I3</option>
						</select>
					</td>
				</tr>
			</table>
		</div>		
		<script>
			function SelectedStoneType(a) {
				var label = a.value;
				if (label == "SemiPrecious") {
					document.getElementById("PreciousBlock").style.display = "none";
					document.getElementById("SemiPreciousBlock").style.display = "block";
				} else {
					document.getElementById("SemiPreciousBlock").style.display="none";
					document.getElementById("PreciousBlock").style.display="block";
				}
			}
		</script>
		<table>
			<tr>
				<td>Choose color</td>
				<td>
					<select name = "color">
						<option value = "red">Red</option>
						<option value = "blue">Blue</option>
						<option value = "black">Black</option>
						<option value = "green">Green</option>
						<option value = "yellow">Yellow</option>
						<option value = "sapphire">Sapphire</option>
						<option value = "purple">Purple</option>
						<option value = "clear">Clear</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Choose cut</td>
				<td>
					<select name = "cut">
						<option value = "round">Round</option>
						<option value = "pear">Pear</option>
						<option value = "oval">Oval</option>
						<option value = "markiz">Markiz</option>
						<option value = "heart">Heart</option>
						<option value = "baguette">Baguette</option>
						<option value = "cushion">Cushion</option>
						<option value = "triangle">Triangle</option>
						<option value = "radiant">Radiant</option>
						<option value = "trillion">Trillion</option>
						<option value = "princess">Princess</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Choose transparency</td>
				<td>
					<select name = "transparency">
						<option value = "transparent">Transparent</option>
						<option value = "translucent">Transluent</option>
						<option value = "opaque">Opaque</option>
					</select>
				</td>
			</tr>
 			<tr>
				<td>Select weight in carats</td>
				<td>
					<input type = "number" min = "1" selected value = "1" name = "weight" required pattern = "^[\d]{1,5}$">
				</td>
			</tr>
			<tr>
				<td>Select price for one carat</td>
				<td>
					<input type = "number" min = "1" selected value = "1" name = "stonePrice" required pattern = "^[\d]{1,5}$">
				</td>
			</tr>
			<tr>
				<td>Add another stone?</td>
				<td>
					<select name = "addStone" onChange = "Selected(this)">
						<option value = "Yes">Yes</option>
						<option value = "No">No</option>
					</select>
				</td>
			</tr>
		</table>
	<script>
		function Selected(a) {
			var label = a.value;
			if (label == "No") {
				document.getElementById("ChainBlock").style.display = "block";
				document.getElementById("Button_1_Block").style.display = "none";
			} else {
				document.getElementById("Button_1_Block").style.display = "block";
				document.getElementById("ChainBlock").style.display = "none";
			}
		}
	</script>
	<div id = "ChainBlock" style = "display: none;">
		<table>
			<tr>
				<td>Choose chain material: </td>
				<td>
					<select name = "chainMeterial">
						<option value = "GOLD">Gold</option>
						<option value = "WHITE_GOLD">Wihte Gold</option>
						<option value = "SILVER">Silver</option>
						<option value = "PLATINUM">Platinum</option>
						<option value = "STEEL">Platinum</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Choose chain carat weight: </td>
				<td>
					<input type = "number" min = "1" selected value = "1" name = "chainWeight" required pattern = "^[\d]{1,5}$">
				</td>
			</tr>			
			<tr>
				<td>Choose price for one carat: </td>
				<td>
					<input type = "number" min = "1" selected value = "1" name = "chainPrice" required pattern = "^[\d]{1,5}$">
				</td>
			</tr>
			<tr>
				<td>Choose probe material: </td>
				<td>
					<select name = "probe">
						<option value = "M1000">M1000</option>
						<option value = "M958">M958</option>
						<option value = "M750">M750</option>
						<option value = "M585">M585</option>
						<option value = "M583">M583</option>
						<option value = "M500">M500</option>
						<option value = "M375">M375</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><p>Choose info type </td>
				<td>
					<select name = "strategy" onChange = "Strategy(this)">
						<option value = "priceSelectionStrategy">Get stones info by price</option>
						<option value = "totalWeightAndCostStrategy">Get weight and total cost</option>
						<option value = "transparencySelectStrategy">Get stones by transparency</option>
					</select>
				</td>
			</tr>	
		</table>
		<script>
			function Strategy(a) {
				var strategy = a.value;
				if (strategy == "transparencySelectStrategy") {
					document.getElementById("StrategyBlock").style.display = "block";
				} else {
					document.getElementById("StrategyBlock").style.display = "none";
				}
			}
		</script>
		<div id = StrategyBlock style = "display: none">
			<table>
				<tr>
					<td>Choose transparency</td>
					<td>
						<select name = "transparencyStrategySelection">
							<option value = "transparent">Transparent</option>
							<option value = "translucent">Transluent</option>
							<option value = "opaque">Opaque</option>
						</select>
					</td>
				</tr>
			</table>
		</div>
		<input type = "submit" value = "Continue">
	</div>
 	<div id = "Button_1_Block" style = "display: block">
		<input type = "submit" value = "Add">
	</div>

	</form>
</body>
</html>