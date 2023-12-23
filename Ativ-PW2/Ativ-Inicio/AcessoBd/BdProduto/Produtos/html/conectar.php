<?php
error_reporting(E_ALL);
ini_set('display_errors', 1);

class Conectar extends PDO
{
    private static $instancia;
    private $query;
    private $host = "127.0.0.1"; // endereço do servidor da etec
    private $usuario = "root"; // usuário do servidor da etec
    private $senha = ""; // senha do servidor da etec
    private $db = "bd_produto"; // nome do banco de dados MySQL

    public function __construct()
    {
        parent::__construct("mysql:host=$this->host;dbname=$this->db", $this->usuario, $this->senha);
    }

    public static function getInstance()
    {
        if (!isset(self::$instancia)) 
        {
            try
            {
                self::$instancia = new Conectar();
            }
            catch (PDOException $e)
            {
                // Tratando o erro aqui
                // Por exemplo, log de erro, mensagem amigável, etc.
                throw new Exception("Erro ao conectar ao banco de dados.");
            }
        }
        return self::$instancia;
    }

    public function sql($query)
    {
        $this->query = $query;
        $stmt = self::$instancia->prepare($this->query);
        $stmt->execute();
        return $stmt;
    }
}






?>