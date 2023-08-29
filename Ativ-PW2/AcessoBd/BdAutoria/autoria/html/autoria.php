<?php

use function PHPSTORM_META\sql_injection_subst;

include_once 'conectar.php';

//parte 1 - atributos


class Autoria
{
     
    private $Cod_Autor;
    private $NomeAutor;
    private $Sobrenome;
    private $Email;
    private $Nasc;
    private $conn;

    //parte 2 os getters e setter
    public function getCod_Autor(){
        return $this->cod_autor;
    }
    public function setCod_Autor($ccod_autor){
        $this->cod_autor = $ccod_autor;
    }

    public function getNomeAutor(){
        return $this->nome;
    }
    public function setNomeAutor($name){
    $this->nome= $name;
    }
    public function getSobrenome(){
        return $this->sobreNome;
    }
       public function setSobrenome($Ssobrenome){
        $this->sobreNome=$Ssobrenome;
    }

    public function getEmail(){
        return $this->email;
    }
       public function setEmail($EEmail){
        $this->email=$EEmail;
    }

    public function getNasc(){
        return $this->nasc;
    }
       public function setNasc($NNasc){
        $this->nasc=$NNasc;
    }

function listar()
{
    try{

        $this->conn = new conectar();
        $sql = $this->conn->query("select * from autor order by Cod_Autor");
        $sql -> execute();
        return $sql->fetchAll();
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "Erro ao executar consulta. " . $exc->getMessage();
    }
}
function salvar()
{  
    try {
        $this->conn = new Conectar();
        $sql = $this->conn->prepare("insert into autor values (null,?,?,?,?)");
        @$sql->bindParam(1, $this->getNomeAutor(), PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getSobrenome(), PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getEmail(), PDO::PARAM_STR);
        @$sql->bindParam(4, $this->getNasc(), PDO::PARAM_STR);
        if ($sql->execute() == 1) {
            return "Registro salvo com sucesso!";
        }
        $this->conn = null;
    } catch (PDOException $exc) {
        echo "Erro ao Salvar o registro." . $exc->getMessage();
    }
}
function exclusao()
 {
    try
    {
        $this-> conn = new Conectar();
        $sql = $this -> conn ->prepare("delete from autor where Cod_Autor = ?"); //informe o ? (parametro)
        @$sql -> bindParam(1,$this->getCod_Autor(),PDO::PARAM_STR);
        if($sql->execute() == 1)
        {
            return "Excluindo com sucesso! ";
        }
        else
        {
            return "Erro na exclusão !";
        }
    
            $this ->conn = null;
        }
    
    catch(PDOException $exc)
    {
        echo "Erro ao excluir" . $exc->getMessage();
    }
      }

      function consultar()
    {
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("select * from autor where NomeAutor like ?");
            @$sql-> bindParam(1, $this->getNomeAutor(),PDO::PARAM_STR);
            @$sql -> execute();
            return $sql->fetchAll();
            $this-> conn = null;

    }
    catch(PDOException $exc)
        {
            echo "Erro ao Executar Consulta.." . $exc->getMessage();
        }
}}


class Autoria2
{
    private $Cod_autor;
    private $Cod_Livro;
    private $DataLancamento;
    private $Editora;
    private $conn;

    public function getCod_autor()
    {
        return $this->cod_Autor;
    }

    public function setCod_Autor($ccod_autor)
    {
        $this->cod_Autor = $ccod_autor;
    }

    public function getCod_Livro()
    {
        return $this->cod_livro;
    }

    public function setCod_Livro($ccod_livro)
    {
        $this->cod_livro = $ccod_livro;
    }

    public function getDataLancamento()
    {
        return $this->DataLanc;
    }

    public function setDataLancamento($DDataLanacamento)
    {
        $this->DataLanc = $DDataLanacamento;
    }

    public function getEditora()
    {
        return $this->Edit;
    }

    public function setEditora($EEditora)
    {
        $this->Edit = $EEditora;
    }

    function listar2()
    {
        try {
            $this->conn = new conectar();
            $sql = $this->conn->query("select * from autoria order by Cod_autor");
            $sql->execute();
            return $sql->fetchAll();
            $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao executar consulta. " . $exc->getMessage();
        }
    }

    function salvar()
    {
        try{
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into autoria values(?,?,?,?)");
            @$sql-> bindParam(1,$this->getCod_autor(),PDO::PARAM_STR);
            @$sql-> bindParam(2,$this->getCod_Livro(),PDO::PARAM_STR);
            @$sql-> bindParam(3,$this->getDataLancamento(),PDO::PARAM_STR);
            @$sql-> bindParam(4,$this->getEditora(),PDO::PARAM_STR);
            if($sql->execute() == 1)
            {
                return "Registro salvo com sucesso!";
            }
            $this->conn = null;
        }
        catch (PDOException $exc)
        {
            echo "Erro ao Salvar o registro." . $exc->getMessage();
        }
    }

    function exclusao()
 {
    try
    {
        $this-> conn = new Conectar();
        $sql = $this -> conn ->prepare("delete from autoria where Cod_Autor = ?"); //informe o ? (parametro)
        @$sql -> bindParam(1,$this->getCod_autor(),PDO::PARAM_STR);
        if($sql->execute() == 1)
        {
            return "Excluindo com sucesso! ";
        }
        else
        {
            return "Erro na exclusão !";
        }
    
            $this ->conn = null;
        }
    
    catch(PDOException $exc)
    {
        echo "Erro ao excluir" . $exc->getMessage();
    }
      }
      
      function consultar(){
        try{

        
      $this -> conn = new Conectar();
       $sql= $this-> conn ->prepare('select * from autoria where  Cod_Autor like ? ');

     @$sql -> bindParam(1,$this->getCod_Autor(),PDO::PARAM_STR);
     @$sql ->execute();
     return $sql -> fetchAll();
     $this -> conn = null;

    }
    catch(PDOException $exc){
        echo "Erro ao executar consulta..." . $exc->getMessage();
    }
    }
}

class Autoria3{
  
     private  $Cod_Livro;
     private $Tiíulo;
     Private $Categoria;
     private $ISBN;
     private $Idioma;
     private $Qtdepag;
     private $conn;

     public function getCod_Livro(){
        return $this-> cod_Livro;
     }
     public function setCod_Livro($CCod_Livro){
        $this->cod_Livro = $CCod_Livro;
     }
     public function getTitulo(){
        return $this-> tiíulo;
     }
     public function setTitulo($TTiíulo){
        $this->tiíulo = $TTiíulo;
     }
     public function getCategoria(){
        return $this-> categoria;
     }
     public function setCategoria($CCategoria){
        $this->categoria = $CCategoria;
     }
     public function getISBN(){
        return $this-> isbn;
     }
     public function setISBN($IISBN){
        $this->isbn = $IISBN;
     }
     public function getIdioma(){
        return $this-> idioma;
     }
     public function setIdioma($IIdioma){
        $this->idioma = $IIdioma;
     }
     public function getQtdepag(){
        return $this-> qtdepag;
     }
     public function setQtdepag($QQtdepag){
        $this->qtdepag = $QQtdepag;
     }
     function listar3()
     {
         try {
             $this->conn = new conectar();
             $sql = $this->conn->query("select * from livro where  Cod_Livro ");
             $sql->execute();
             return $sql->fetchAll();
             $this->conn = null;
         } catch (PDOException $exc) {
             echo "Erro ao executar consulta. " . $exc->getMessage();
         }
     }
    
     //Parte Salvar
    function salvar()
    {  
        try {
            $this->conn = new Conectar();
            $sql = $this->conn->prepare("insert into livro values (null,?,?,?,?,?)");
            @$sql->bindParam(1, $this->getTitulo(), PDO::PARAM_STR);
            @$sql->bindParam(2, $this->getCategoria(), PDO::PARAM_STR);
            @$sql->bindParam(3, $this->getISBN(), PDO::PARAM_STR);
            @$sql->bindParam(4, $this->getIdioma(), PDO::PARAM_STR);
            @$sql->bindParam(5, $this->getQtdepag(), PDO::PARAM_STR);
            if ($sql->execute() == 1) {
                return "Registro salvo com sucesso!";
            }
            $this->conn = null;
        } catch (PDOException $exc) {
            echo "Erro ao Salvar o registro." . $exc->getMessage();
        }
    }

    function exclusao()
    {
       try
       {
           $this-> conn = new Conectar();
           $sql = $this -> conn ->prepare("delete from livro where Cod_Livro = ?"); //informe o ? (parametro)
           @$sql -> bindParam(1,$this-> getCod_Livro(),PDO::PARAM_STR);
           if($sql->execute() == 1)
           {
               return "Excluindo com sucesso! ";
           }
           else
           {
               return "Erro na exclusão !";
           }
       
               $this ->conn = null;
           }
       
       catch(PDOException $exc)
       {
           echo "Erro ao excluir" . $exc->getMessage();
       }
         }
      function consultar(){
        try{

        
      $this -> conn = new Conectar();
       $sql= $this-> conn ->prepare('select * from livro where Cod_Livro like ? ');
       @$sql -> bindParam(1,$this-> getCod_Livro(),PDO::PARAM_STR);
       @$sql ->execute();
       return $sql -> fetchAll();
       $this -> conn = null;

    }
    catch(PDOException $exc){
        echo "Erro ao executar consulta..." . $exc->getMessage();
    }
    }
    
        
}
     //Parte alterar
    
     function alterar(){
        try{
            $this-> conn = new Conectar();
            $sql = $this -> conn ->prepare("select * from produto where id = ?"); //informe o ? (parametro)
            @$sql -> bindParam(1,$this->getId(),PDO::PARAM_STR);
    @sql->execute();

                return $sql->fetchAll();
                $this ->conn = null;
            }
        
        catch(PDOException $exc)
        {
            echo "Erro ao alterar." . $exc->getMessage();
        }
     }

     function alterar2(){
        try{
        $this-> conn = new Conectar();
        $sql = $this -> conn ->prepare("update produto set nome = ?, estoque = ? where id = ?");
        @$sql -> bindParam(1,$this->getNome(),PDO::PARAM_STR);
        @$sql->bindParam(2, $this->getEstoque(),PDO::PARAM_STR);
        @$sql->bindParam(3, $this->getId(),PDO::PARAM_STR);
        if($sql->execute()==1)
        {
            return "Registro alterado com sucesso!";
        }
        $this->conn = null;
    }
    catch(PDOException $exc)
    {
        echo "Erro ao Salvar o registro." . $exc->getMessage();
    }
 }

 function consultar()
 {
    try{
        $this-> conn = new Conectar();
        $sql = $this -> conn ->prepare("select * from produto where nom,e like  ?"); //informe o ? (parametro)
        @$sql -> bindParam(1,$this->getId(),PDO::PARAM_STR);
        //@$sql-> bindParam(1,$this->getNome()."%",PDO::PARAM_STR);
        
     sql->execute();

            return $sql->fetchAll();
            $this ->conn = null;
        }
    
    catch(PDOException $exc)
    {
        echo "Erro ao EXECUTAR CONSULTA.." . $exc->getMessage();
    }
 }

 function exclusao()
 {
    try
    {
        $this-> conn = new Conectar();
        $sql = $this -> conn ->prepare("delete from produto where id = ?"); //informe o ? (parametro)
        @$sql -> bindParam(1,$this->getId(),PDO::PARAM_STR);
        if($sql->execute() == 1)
        {
            return "Excluindo com sucesso! ";
        }
        else
        {
            return "Erro na exclusão !";
        }
    
            $this ->conn = null;
        }
    
    catch(PDOException $exc)
    {
        echo "Erro ao excluir" . $exc->getMessage();
    }
      }
        
    
    

