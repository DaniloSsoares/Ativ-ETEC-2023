<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <link rel="stylesheet" type="text/css" href="../css/Menu.css">
    <title>Document</title>
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
                <form name="cliente" action="" method="POST">
                    <h2>Cadastrar</h2>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="nome"  name="txtnome" type="text"  required>
                        <label>Nome:</label>
                    </div>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='lock-alt' type='solid'></box-icon></span>
                        <input id="estoque" name="txtestoq" type="text"  required>
                        <label>Estoque</label>
                    </div>
        
                    <button  name="btnenviar" type="submit" class="btn" value ="cadastrar">Cadastrar</button>

                   <div class="btn1"><button type="button" class="btn" onclick="limparCampos()">
                <a href="#"> Limpar</a></button>
                    </div>
                  
                <div class="btn2"><button type="button" class="btn">
                <a href="index.html">Voltar</a></button>
                </div>
                    
                </form>
            </div>

            <?php
           

            error_reporting(E_ALL);
            ini_set('display_errors', 1);
            
            include_once 'conectar.php';
            include_once 'Produto.php'; 
            
            // Verifica se o formulário foi enviado
            if (isset($_POST['btnenviar'])) {
                try {
                    $nome = $_POST['txtnome'];
                    $estoque = $_POST['txtestoq'];
            
                    // Cria um novo objeto Produto
                    $produto = new Produto();
            
                    // Define os atributos do produto
                    $produto->setNome($nome);
                    $produto->setEstoque($estoque);
            
                    // Chama o método salvar() para inserir o novo produto no banco de dados
                    $mensagem = $produto->salvar();
            
                    // Exibe a mensagem de sucesso ou erro
                    echo "<h3><br><br>" . $mensagem . "</h3>";
                } catch (Exception $e) {
                    // Em caso de exceção, exibe a mensagem de erro
                    echo "Erro ao salvar o produto: " . $e->getMessage();
                }
            }
            ?>

         <script>
         function limparCampos() {
         document.getElementById('nome').value = '';
         document.getElementById('estoque').value = '';
         }
         </script>


</body>
</html>