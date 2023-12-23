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
    $Vl = $_POST['Valor']; 

    if($Vl % 2 == 0){
  echo "O valor Digitado é Par!";
    }
    elseif($Vl % 2==1){
        echo"O valor Digitado é Impar!";
    }
    ?>
</body>
</html>