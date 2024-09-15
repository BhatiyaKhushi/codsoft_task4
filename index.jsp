<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Currency Converter</title>
</head>
<body>
	<h1>Currency Converter</h1>
	<form action="convert" method="post">
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount" required><br><br>
		

		<label for="fromCurrency">From:</label> <select id="fromCurrency"
			name="fromCurrency">
			<option value="USD">USD </option>
			<option value="EUR">EUR</option>
			<option value="GBP">GBP</option>
		</select>
		<br>
		<br>

		<label for="toCurrency">To:</label> <select id="toCurrency"
			name="toCurrency">
			<option value="USD">USD</option>
			<option value="EUR">EUR</option>
			<option value="GBP">GBP</option>

		</select>
		<br>
		<br>
		
		<button type="submit">Convert</button>
	</Form>
</body>
</html>