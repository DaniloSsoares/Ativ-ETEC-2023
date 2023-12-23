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
            <a href="index.html" class="logo">Home</a>
              
                <ul>

                <li><a href="#">Cadastrar</a>
                    <ul>
                        <li><a href="cadastrar.php">Cadastrar... </a></li>
                       
                    </ul>
                </li></li>
                <li><a href="#">Listar</a>
                    
                        <ul>
                            <a href="listar.php">Lista Produto</a>
                           
                        </ul>
                    </li></li>
              
                    <li><a href="#">Pesquisar</a>
                        <ul>
                        <li><a href="pesquisa.php">Pesquisar Produtos</a></li>
                              
                        </ul>
                    </li></li>
                <li><a href="#">Excluir</a>
                    
                        <ul>
                            <a href="excluir.php">Excluir</a>
                           
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