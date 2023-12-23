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
    $vlI = $_POST['VlIn'];
    $vlF = $_POST['VlFl'];
    $SomaIm = 0;

    for($i =$vlI; $i <= $vlF; $i++){
    if($i % 2 != 0 ){
        $SomaIm += $i;
    }
      }
    
    
    for($i =$vlF; $i <= $vlI; $i++){
        if($i % 2 != 0 ){
            $SomaIm += $i;
        }
          }
        
    for($i =$vlI; $i <= $vlF; $i++){
        if($i % 2!= 0 ){
            $SomaIm += $i;
        }
         }

        echo " A soma dos números impares entre o inicial e o final é: " . $SomaIm;
        
    ?>
</body>
</html>