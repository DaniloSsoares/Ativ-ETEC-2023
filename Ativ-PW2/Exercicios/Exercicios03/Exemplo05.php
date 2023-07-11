<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <title>Código da página tabuada.php</title>
</head>
<body>
<header>
    <h1>Resultado do processamento</h1>
    </header>

    <?php
    $i=0;
    while($i<=10){
        $tab = 2*$i;
        echo '2' . 'X' . $i. ' = ' . $tab . ' <br/>';
        $i++;
    }
    ?>
</body>
</html>