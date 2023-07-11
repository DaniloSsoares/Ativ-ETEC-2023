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
   $VlA = $_POST['ValorA'];
   $VlB = $_POST['ValorB'];

   for($i =$VlA; $i >= $VlB; $i--){
    if($i % 2 == 1 ){
         echo "O valores Impares são:" .$i .'<BR/>';
       }}
       for($i =$VlB; $i >= $VlA; $i--){
        if($i % 2 == 1 ){
             echo "O valores Impares são:" .$i .'<BR/>';
           }
   }
   ?>

</body>
</html>