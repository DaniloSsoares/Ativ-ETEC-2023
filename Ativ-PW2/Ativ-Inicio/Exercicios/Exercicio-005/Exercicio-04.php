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
$Sen = $_POST['Senha'];
$Usu = $_POST['Usuario'];
    if($Sen == 'ETE' && $Usu == 'ETE'){
        echo "Bem Vindo ao Sistema ". $Usu;
    }elseif($Sen != 'ETE' || $Usu != 'ETE'){
        echo "Usuário ou Senha Invalido!!  ";
        echo "Tente Novamente! ";
    }
    ?>
</body>
</html>