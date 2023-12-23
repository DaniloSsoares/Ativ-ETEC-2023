<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <title>Document</title>
</head>
<body>



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