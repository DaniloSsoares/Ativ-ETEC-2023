<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Document</title>
</head>
<body>
<header>
    <h1>Resultado do processamento</h1>
    </header>
<main>
<?php 
$soma = 0;
for ($i=2; $i<=10; $i += 2) {
    echo  "Numero par " . $i .'<br/>';
    $soma += $i;        
}
echo "<br>A somatória dos números pares é: " . $soma;
?>
</body>
</html>