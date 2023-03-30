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
    
    $Preço = $_POST['Valor'];
    $Porcent = $_POST['Porc'];
 $Desc =$Preço *$Porcent / 100;
$Pagar = $Preço - $Desc ;
echo "O valor á ser pago  com o desconto é $".number_format($Pagar, 2, ',' ).'<br/>'

    ?>
</body>
</html>