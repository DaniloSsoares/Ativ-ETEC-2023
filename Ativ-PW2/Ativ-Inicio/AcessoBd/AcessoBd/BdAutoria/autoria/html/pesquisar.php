<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <link rel="stylesheet" type="text/css" href="../css/Menu.css">
    <title>Pesquisa</title>
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

       
    <div class="logreg-box">
        <div class="caixa-Login">
            <form action="" name="cliente" method="POST">
                <h2>Pesquisar </h2>

                <div class="input-box">
                <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                <input id="pesquisa" type="text" name="txtnome" required>
                <Label>Pesquisar: (NomeAutor)</Label>
                </div>
                
                <button name="btnpesquisar" type="submit" class="btn" value="cadastrar">Pesquisar</button>

                <div class="btn1"><button type="button" class="btn" onclick="limparCampos()">
                <a href="#"> Limpar</a></button>
                    </div>
                  
                <div class="btn2"><button type="button" class="btn">
                <a href="index.html">Voltar</a></button>
                </div>

            </form>

        </div>
    </div>

    <?php 
     error_reporting(E_ALL);
     ini_set('display_errors', 1);

    if(isset($_POST['btnpesquisar'])){
        include_once 'autoria.php';
        $p = new Autoria();
        $p->setNomeAutor($_POST['txtnome'] . '%');// Concatenando '%' para busca aproximada
        $pro_bd = $p->consultar(); // Chamada do método com retorno
        foreach ($pro_bd as $pro_mostrar) {
            echo "Cod_Autor: " . $pro_mostrar[0] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 0
            echo "NomeAutor: " . $pro_mostrar[1] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 1
            echo "Sobrenome: " . $pro_mostrar[2] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 2
            echo "Email: " . $pro_mostrar[3] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 3
            echo "Nasc: " . $pro_mostrar[4] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 4
        }
    }
       
     
        
    
    ?>

<script>
    function limparCampos() {
    document.getElementById('pesquisa').value = '';
     }
    </script>
</body>
</html>