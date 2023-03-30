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
    <h1>Resultado do processamento 
        <br>
        Trocando os Valores de A com B
    </h1>
    
    </header>
<main>
    <?php 
    $a = $_POST['A'];
    $b = $_POST['B'];
    
    $C = $a;
    $a = $b;
    $b = $C;
    echo " O valor de A = " . $a. 
    '<br/>';
echo "E o valor de B = " . $b
    ?>
</body>
</html>