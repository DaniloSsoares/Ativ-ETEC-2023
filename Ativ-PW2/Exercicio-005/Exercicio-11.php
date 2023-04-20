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
for ($i = 3; $i <= 8; $i++) {
  $soma += $i;
}
echo "A soma dos números inteiros de 3 a 8 é: " . $soma. '<br/>';

$soma = 0;
$i = 3;
do {
  $soma += $i;
  $i++;
} while ($i <= 8);
echo "A soma dos números inteiros de 3 a 8 é: " . $soma;

?>
</body>
</html>