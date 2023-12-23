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
                <form name ="cliente" action="" method="POST">
                    <h2>Excluir Produto</h2>
        
                    <div class="input-box">
                        <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                        <input id="id" name = "txtid" type="text" required> </input> 
                        <label>Id:</label>
                    </div>
        
                  
        
                    <input name="btnenviar" type="submit" value="Excluir" class="btn">

                    <div class="btn1"><button type="button" class="btn" onclick="limparCampos()">
                <a href="#"> Limpar</a></button>
                </div>
                  
                <div class="btn2"><button type="button" class="btn">
                <a href="index.html">Voltar</a></button>
                </div>
        
                    
                </form>
            </div>
 <!--   <font size = "4">
        <form name ="cliente" method = "POST" Action = "">
         <fieldset id ="a">
<legend><b>Informe o Id do Produto desejado:</b></legend>
<p>Id:<input name = "txtid" type="text" ></input></p>

<input name="btnenviar" type="submit" value="Excluir" class="btn">
<button type="submit" class="btnV"><a href= "index.html">Voltar</button>
         </fieldset>
        </form>
        <fieldset id="b"> !-->

        <?php 
        extract($_POST,EXTR_OVERWRITE);
        if(isset($btnenviar))
        {
            include_once 'Produto.php';
            $p = new Produto();
            $p->setId($txtid);
            echo "<h3>" . $p->exclusao() . "<h3>"; //chamada de método - o $p é parametro enviado
        }
        
        ?>
        </fieldset>

        <script>
    function limparCampos() {
    document.getElementById('id').value = '';
     }
</script>

        
</body>
</html>