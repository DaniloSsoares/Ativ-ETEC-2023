<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <link rel="stylesheet" type="text/css" href="../css/Menu.css">
    <title>Cadastrar</title>
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
                                <li><a href="Perquisar.php">Pesquisar Autor</a></li>
                                <li><a href="Perquisar2.php">Pesquisar Autoria</a></li>
                                <li><a href="Perquisar3.php">Pesquisar Livro</a></li>
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
                <form action="" method="POST">
                    <h2>Cadastrar</h2>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="nome" type="text" name="txtnome" required>
                        <label>Nome:</label>
                    </div>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="sobre" type="text" name="txtsobrenome" required>
                        <label>sobreNome:</label>
                    </div>

                    <div class="input-box">
                        <span class="icon"><box-icon name='lock-alt' type='solid'></box-icon></span>
                        <input id="email" type="email" name="txtEmail" required>
                        <label>Email</label>
                    </div>

                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="data" type="date" name="txtdata" required>
                        <label>Nascimento</label>
                    </div>
        
                    <button type="submit" name="btnEnviar"  class="btn">Cadastrar</button>

                <div class="btn1"><button type="button" class="btn" onclick="limparCampos()">
                <a href="#"> Limpar</a></button>
                </div>
                  
                <div class="btn2"><button type="button" class="btn">
                <a href="index.html">Voltar</a></button>
                </div>
        
                    
                </form>
            </div>
  
   
 
  
            <?php

            include_once 'conectar.php';
            include_once 'autoria.php'; 

            extract($_POST, EXTR_OVERWRITE);
            if(isset($_POST['btnEnviar'])) 

            

           try {
                include_once 'autoria.php';

                $nome = $_POST['txtnome'];
                $Sobrenome = $_POST['txtsobrenome'];
                $Email = $_POST['txtEmail'];
                $data = $_POST['txtdata'];

                $aut= new Autoria();

                $aut->setNomeAutor($nome);
                $aut->setSobrenome($Sobrenome);
                $aut->setEmail($Email);
                $aut->setNasc($data);

                $mensagem = $aut->salvar();

                echo "<h3><br><br>" . $mensagem. "</h3>";

            } catch (Exception $e) {
             
                echo "Erro ao salvar o produto: " . $e->getMessage();
            }
        
            ?>

<script>
function limparCampos() {
    document.getElementById('nome').value = '';
    document.getElementById('sobre').value = '';
    document.getElementById('email').value = '';
    document.getElementById('data').value = '';
}
</script>

</body>
</html>