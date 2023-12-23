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

       
<div class="logreg-box">
            <div class="caixa-Login">
                <form action="" method="POST">
                    <h2>Cadastrar</h2>

                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="codAU" type="number" name="txtCodAut" required>
                        <label>Código de Autor:</label>
                    </div>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="codLi" type="number" name="txtCod" required>
                        <label>Código de Livro:</label>
                    </div>
    

                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="data" type="date" name="txtdata" required>
                        <label>Data de Lançamento:</label>
                    </div>
 

                    <div class="input-box">
                        <span class="icon"><box-icon name='lock-alt' type='solid'></box-icon></span>
                        <input id="edit" type="txt" name="txtEditora" required>
                        <label>Editora</label>
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
            include_once'conectar.php';
            include_once'autoria.php';

            extract($_POST,EXTR_OVERWRITE);
            if(isset($_POST['btnEnviar']))
            try{
                include_once 'autoria.php';

                $codAutor = $_POST['txtCodAut'];
                $codLivro = $_POST['txtCod'];
                $DataLan = $_POST['txtdata'];
                $Editora = $_POST['txtEditora'];
                

                $aut = new Autoria2();
                $aut->setCod_Autor($codAutor);
                $aut->setCod_Livro($codLivro);
                $aut->setDataLancamento($DataLan);
                $aut->setEditora($Editora);
              

                $messagem = $aut->salvar();

                echo"<h3><h3><h3>" . $messagem. "</h3>";
                }
                catch(Exception $e){
                echo "Erro ao salvar autoria: " . $e->getMessage();
                }
            
            
            ?>

<script>
function limparCampos() {
    document.getElementById('codAU').value = '';
    document.getElementById('codLi').value = '';
    document.getElementById('data').value = '';
    document.getElementById('edit').value = '';
}
</script>
</body>
</html>