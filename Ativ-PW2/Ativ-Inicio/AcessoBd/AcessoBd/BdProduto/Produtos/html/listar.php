<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css2.css">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <link rel="stylesheet" type="text/css" href="../css/Menu.css">
   
    <title>Listar</title>
</head>
<body>

   
<header>
        <input type="checkbox" id="menu-bar">
        <label for="menu-bar">Menu</label>
        
        <div class="nav">
            
            <div class="menu">
                
                <nav>
                <a href="index.html" class="logo">Logo</a>
                  
                    <ul>

                    <li><a href="#">Cadastrar</a>
                        <ul>
                            <li><a href="cadastrar.php">Cadastrar Autor</a></li>
                            <li><a href="cadastrar2.php">Cadastrar Autoria</a></li>
                            <li><a href="cadastrar3.php">Cadastrar Livro</a></li>
                        </ul>
                    </li></li>
                    <li><a href="#">Listar</a>
                        
                            <ul>
                                <li><a href="listar.php">Listar Autor</a></li>
                                <li><a href="listar2.php">Listar Autoria</a></li>
                                <li><a href="listar3.php">Listar Livro</a></li>
                            </ul>
                        </li></li>
                  
                        <li><a href="#">Pesquisar</a>
                            <ul>
                            <li><a href="pesquisar.php">Pesquisar Autor</a></li>
                                   <li> <a href="pesquisar2.php">Pesquisar Autoria</a></li>
                                   <li> <a href="pesquisar3.php">Pesquisar Livro</a></li>
                            </ul>
                        </li></li>
                    <li><a href="#">Excluir</a>
                        
                            <ul>
                                <li><a href="excluir.php">Excluir Autor</a></li>
                                <li><a href="excluir2.php">Excluir Autoria</a></li>
                                <li><a href="excluir3.php">Excluir Livro</a></li>
                            </ul>
                        </li></li>
                </ul>
                </nav>
            </div>
        </div>
       </header>
       
<div class="container">
            <div class="card">
                
                <center><font face = "Century Gothic" size ="6"><b>Relação de Produtos Cadastro<b><br><br><font size ="4"
                  
        
                
<?php

include_once 'Produto.php';
$p = new Produto();
$pro_bd = $p-> listar();

?>
<b> Id &nbsp;&nbsp;&nbsp;&nbsp; Nome &nbsp;&nbsp;&nbsp;&nbsp;Estoque </b>

<?php 
if (is_array($pro_bd))
{
    foreach ($pro_bd as $pro_mostrar) 
    {
        ?>
        <br><br>
        <b> <?php echo $pro_mostrar[0]; ?></b>&nbsp;&nbsp;&nbsp;&nbsp;
            <?php echo $pro_mostrar[1]; ?>&nbsp;&nbsp;&nbsp;&nbsp;
            <?php echo $pro_mostrar[2]; ?>
        <?php
    }
}
     ?>
 
                  
    <div class="btn2">
    <a href="index.html">Voltar</a>
    </div>
      
     

</div></div>
</body>
</html>