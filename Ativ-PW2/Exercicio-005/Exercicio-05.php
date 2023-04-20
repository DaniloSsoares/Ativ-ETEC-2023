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
    $B1 = $_POST['Bim1'];
    $B2 = $_POST['Bim2'];
    $Nota = ($B1+$B2) /2;
    echo "Sua Nota Final é " .$Nota. '<br/>' ;
    if ($Nota>=8) {
        echo '<font color="Green">'. "Aprovado";
    }
      else if ($Nota<=3) { 
               echo  '<font color="Red">'. "Reprovado";
            }
            else if ($Nota>3) { 
                echo  '<font color="Orange">'. "Recuperação";
             
             }
             ?>
</body>
</html>