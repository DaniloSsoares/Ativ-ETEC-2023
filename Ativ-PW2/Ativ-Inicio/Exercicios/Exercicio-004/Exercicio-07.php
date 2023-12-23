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
    <h1>Resultado do processamento<br>
Nota Final!
</h1>
    </header>
<main>
    <?php
    $B1 = $_POST['Bimest1'];
    $B2 = $_POST['Bimest2'];
    $B3 = $_POST['Bimest3'];
    $B4 = $_POST['Bimest4'];
    $MA = ($B1 + $B2 +$B3+ $B4) / 4;
    echo "Sua nota foi: " .$MA;
if($MA >= 6){
    ECHO '<font color="Green">' ." Aprovado! ";
}else
    if($MA <3){
        ECHO '<font color="RED ">' ." Retido! ";
    }else
        if($MA >= 3 && $MA<6){
            ECHO '<font color="orange ">' ." Exame !";
        
        

}
 
 ?>
    
</body>
</html>