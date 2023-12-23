<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css.css">
    <link rel="stylesheet" type="text/css" href="../css/tabela.css">
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
                <a href="index.html" class="logo">Home</a>
                  
                    <ul>

                    <li><a href="#">Cadastrar</a>
                        <ul>
                            <li><a href="cadastrar.php">Cadastrar Produto</a></li>
                           
                        </ul>
                    </li></li>
                    <li><a href="#">Listar</a>
                        
                            <ul>
                                <li><a href="listar.php">Listar Produto</a></li>
                               
                            </ul>
                        </li></li>
                  
                        <li><a href="#">Pesquisar</a>
                            <ul>
                            <li><a href="pesquisa.php">Pesquisar Produto</a></li>
                                
                            </ul>
                        </li></li>
                    <li><a href="#">Excluir</a>
                        
                            <ul>
                                <li><a href="excluir.php">Excluir Produto</a></li>
                                
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
                    <h3> Listar Produtos</h3>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Estoque</th>
                    </tr>
                </thead>
                <tbody>
                    

                  
        


                <tbody>
                    <?php
                    include_once 'Produto.php';
                    $p = new Produto();
                    $pro_bd = $p->listar();
                     ?>
                     <?php 
                    if (is_array($pro_bd)) {
                        foreach ($pro_bd as $pro_mostrar) {
                            ?>
                            <?php echo "<tr>";?>
                            <?php echo "<td>{$pro_mostrar[0]}</td>";?>
                            <?php echo "<td>{$pro_mostrar[1]}</td>";?>
                            <?php echo "<td>{$pro_mostrar[2]}</td>";?>
                            <?php echo "</tr>";
                             
                        }
                    }
                    ?>
                </tbody>
                
            </table>
            <div class="btn3">
    <a href="index.html">Voltar</a>
    </div>
    </div>
    </div>
            </fieldset>
    

      
</body>
</html>