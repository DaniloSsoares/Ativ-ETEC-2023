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
                        <input id="Tit" type="text" name="txtTitulo" required>
                        <label>Título:</label>
                    </div>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="Cate" type="text" name="txtCategoria" required>
                        <label>Categoria:</label>
                    </div>

                    <div class="input-box">
                        <span class="icon"><box-icon name='lock-alt' type='solid'></box-icon></span>
                        <input id="ISBN" type="text" name="txtISBN" required>
                        <label>ISBN</label>
                    </div>

                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="Idio" type="text" name="txtIdioma" required>
                        <label>Idioma:</label>
                    </div>

                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="Quan" type="number" name="txtPg" required>
                        <label>Quantidades de Páginas:</label>
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
try{
    include_once 'autoria.php';
      $Titulo = $_POST['txtTitulo'];
      $Categoria = $_POST['txtCategoria'];
      $ISBN = $_POST['txtISBN'];
      $Idioma = $_POST['txtIdioma'];
      $Pg = $_POST['txtPg'];

      $aut = new Autoria3();

      $aut-> setTitulo( $Titulo);
      $aut-> setCategoria($Categoria);
      $aut-> setISBN($ISBN);
      $aut-> setIdioma($Idioma);
      $aut-> setQtdepag($Pg);

      $mensagem = $aut->salvar();

      echo "<h3><br><br>" . $mensagem . "</h3>";
}
catch (Exception $e){
    echo "Erro ao salvar o produto: " . $e->getMessage();
}

            ?>


<script>
function limparCampos() {
    document.getElementById('Tit').value = '';
    document.getElementById('Cate').value = '';
    document.getElementById('ISBN').value = '';
    document.getElementById('Idio').value = '';
    document.getElementById('Quan').value = '';
}
</script>
</div>
            </body>
            </html>
            