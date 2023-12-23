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
for ($i = 0; $i <= 20; $i++) {
    
  if($i %4 == 0){
    echo " Número Divisivel por 4 é $i  <br>".'<br/>';
  }
}
  echo "Usando Do".'<br/>';
  $i = 0;
  do {
    if($i % 4 == 0){ ;
    
    echo "Número Divisivel por 4 é $i  <br>".'<br/>';}
    $i++;
  } while ($i <= 20);
  ?>
</body>
</html>