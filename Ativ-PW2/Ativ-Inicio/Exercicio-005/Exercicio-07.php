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


$Cod = $_POST['Codigo'];
  switch ( $Cod ){  
    case 1:  
        echo "Secretária";
        break;
           case 2:
             echo "Gerente";
        break;
           case 3:
              echo "Operário";
              break;
                     case 4:
                         echo "Analista"; 
                         break;      
                          case 5:
                              echo "Faxineiro"; break;  
                              default:
                              echo "Código inválido";
                              break;
                            }
                                 ?>
</body>
</html>