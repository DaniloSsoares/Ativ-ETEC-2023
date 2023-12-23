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
 echo "Usando For".'<br/>';
for ($i = 1; $i <= 10; $i++) {
    $quadrado = $i * $i;
    echo "O quadrado de $i é: $quadrado <br>".'<br/>';
  }
  echo "Usando Do".'<br/>';
  $i = 1;
  do {
    $quadrado = $i * $i;
    
    echo "O quadrado de $i é: $quadrado <br>".'<br/>';
    $i++;
  } while ($i <= 10);


?>
</body>
</html>