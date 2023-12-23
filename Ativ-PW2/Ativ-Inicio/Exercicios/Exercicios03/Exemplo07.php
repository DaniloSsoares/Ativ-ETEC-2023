<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
    <title>Implementação da página tabuada dois.php</title>
</head>
<header>
    <h1>Resultado do processamento</h1>
    </header>

<body>
    <?php
    $i = 0;
    
    do{
        
        $tab = 2 * $i;
        
        echo '2' . 'X' . $i . '='. $tab .
        '<br/>';
        
        $i++;
     } while($i <= 10);
     
    ?>
</body>
</html>