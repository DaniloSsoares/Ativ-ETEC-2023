<head>
    <title>função 1</title>
</head>
<body>
    <?phpfunction escreve_separa($cadeia)
    {
        for ($i=0;$i<strlen($cadeia);$i++)
        {
            echo $cadeia[$i]; 
            if ($i<strlen($cadeia)-1) echo "-";
             }}escreve_separa ("Ola");
              echo "<p>";
              escreve_separa ("Texto mais comprido, para ver o que faz");
               ?> 
               </body> 
               </html>