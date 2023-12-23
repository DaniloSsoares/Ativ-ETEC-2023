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