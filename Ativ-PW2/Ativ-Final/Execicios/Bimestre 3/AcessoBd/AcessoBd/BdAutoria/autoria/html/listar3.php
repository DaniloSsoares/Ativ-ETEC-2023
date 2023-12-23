<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css2.css">
    <link rel="stylesheet" type="text/css" href="../css/Menu.css">
    <link rel="stylesheet" type="text/css" href="../css/tabela.css">
    <title>Listar</title>
</head>
<body>


<header>
        <input type="checkbox" id="menu-bar">
        <label for="menu-bar">Menu</label>
        
        <div class="nav">
            
            <div class="menu">
                
                <nav>
                <a href="index.html" class="logo">Home</a>
                  
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

 
                 
       <div class="box">
       <fieldset>
            <table class="product-table">
                <thead>
                    <h3> Listar Livro</h3>
                    <tr>
                        
                        <th>>Cod_Livro</th>
                        <th>Título</th>
                        <th>Categoria</th>
                        <th>ISBN</th>
                        <th>Idioma</th>
                        <th>Quantidade-Pgs</th>
                       
                    </tr>
                </thead>
                <tbody>
  
         
        

<?php

include_once 'autoria.php';

$p3 = new Autoria3();
$pro_bd3 = $p3->listar3();


?>


<?php 
 if (is_array($pro_bd3)) {
    foreach ($pro_bd3 as $pro_mostrar) {
        
       echo "<tr>";
        echo "<td>{$pro_mostrar[0]}</td>";
        echo "<td>{$pro_mostrar[1]}</td>";
        echo "<td>{$pro_mostrar[2]}</td>";
        echo "<td>{$pro_mostrar[3]}</td>";
        echo "<td>{$pro_mostrar[4]}</td>";
        echo "<td>{$pro_mostrar[5]}</td>";
        echo "</tr>";
    }
}
?>
         
</table>
<div class="btn3">
<a href="index.html">Voltar</a>
</div>
</div>
</div>
</fieldset>
</body>
</html>