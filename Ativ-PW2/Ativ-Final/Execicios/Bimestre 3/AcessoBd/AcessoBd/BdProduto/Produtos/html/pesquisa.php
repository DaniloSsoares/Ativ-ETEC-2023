<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/css3.css">
    <link rel="stylesheet" type="text/css" href="../css/tabela.css">
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
    
  <div class="box">
       <fieldset>
            <table class="product-table"  >
                <thead>
                    <h3> Pesquisar Produto</h3>
                    <tr>
                        <th>Id</th>
                        <th>Nome</th>
                        <th>Estoque</th>
                       
                       
                    </tr>
                </thead>
                <tbody>
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
            echo "<tr>";
            echo "<td>ID: " . $pro_mostrar[0] . "</td>";//como matriz - posição 0
            echo "<td>Nome: " . $pro_mostrar[1] . "</td>";//como matriz - posição 1
            echo "<td>Estoque: " . $pro_mostrar[2] . "</td>";//como matriz - posição 2
        }
    }
    ?>
  
  </table>
</div>
</div>
</fieldset>
    <script>
    function limparCampos() {
    document.getElementById('pesquisa').value = '';
     }
    </script>

</body>
</html>