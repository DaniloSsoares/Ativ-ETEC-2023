<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <title>Pesquisa</title>
</head>
<body>
    <div class="logreg-box">
        <div class="caixa-Login">
            <form action="" name="cliente" method="POST">
                <h2>Pesquisar</h2>

                <div class="input-box">
                <span class="icon"><box-icon name='envelope' type='solid'></box-icon></span>
                <input  id="pesquisa" type="text" name="txtnome" required>
                <Label>Pesquisar:(nome do Produto)</Label>
                </div>
                <button  name="btnpesquisar" type="submit" class="btn" value="cadastrar">Pesquisar</button>

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

    if(isset($_POST['btnpesquisar']))
    {
        include_once 'Produto.php';
        $p = new Produto();
        $p->setNome($_POST['txtnome'] . '%');// Concatenando '%' para busca aproximada
        $pro_bd = $p->consultar(); // Chamada do método com retorno
        foreach ($pro_bd as $pro_mostrar) {
            echo "ID: " . $pro_mostrar[0] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 0
            echo "Nome: " . $pro_mostrar[1] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 1
            echo "Estoque: " . $pro_mostrar[2] . "&nbsp;&nbsp;&nbsp;&nbsp;";//como matriz - posição 2
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