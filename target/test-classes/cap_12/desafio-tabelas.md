Para este desafio, vamos primeiro conhecer a estrutura da tabela que iremos trabalhar:

```html
<html>

<head>
    <style>
        table.blueTable {
            border: 1px solid #1C6EA4;
            background-color: #EEEEEE;
            width: 100%;
            text-align: left;
            border-collapse: collapse;
          }
          table.blueTable td, table.blueTable th {
            border: 1px solid #AAAAAA;
          }
          table.blueTable tbody td {
            font-size: 13px;
          }
          table.blueTable tr:nth-child(even) {
            background: #D0E4F5;
          }
          table.blueTable thead {
            background: #1C6EA4;
            background: -moz-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
            background: -webkit-linear-gradient(top, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
            background: linear-gradient(to bottom, #5592bb 0%, #327cad 66%, #1C6EA4 100%);
            border-bottom: 2px solid #444444;
          }
          table.blueTable thead th {
            font-size: 15px;
            font-weight: bold;
            color: #FFFFFF;
            border-left: 2px solid #D0E4F5;
          }
          table.blueTable thead th:first-child {
            border-left: none;
          }
          table.blueTable tfoot .links a{
            display: inline-block;
            background: #1C6EA4;
            color: #FFFFFF;
            padding: 2px 8px;
            border-radius: 5px;
          }
        </style>
</head>

<body>
    <table id="tbl_campeoes" class="blueTable">
        <thead>
            <td>Seleção</td>
            <td>Títulos</td>
            <td>Primeiro Título</td>
            <td>Último Título</td>
        </thead>
        <tr>
            <td>Brasil</td>
            <td><input type="text" value=5></td>
            <td>1958</td>
            <td>2002</td>
        </tr>
        <tr>
            <td>Alemanha</td>
            <td><input type="text" value=4></td>
            <td>1954</td>
            <td>2014</td>
        </tr>
        <tr>
            <td>Itália</td>
            <td><input type="text" value=4></td>
            <td>1934</td>
            <td>2006</td>
        </tr>
        <tr>
            <td>Argentina</td>
            <td><input type="text" value=2></td>
            <td>1978</td>
            <td>1986</td>
        </tr>
        <tr>
            <td>Uruguai</td>
            <td><input type="text" value=2></td>
            <td>1930</td>
            <td>1950</td>
        </tr>
        <tr>
            <td>Inglaterra</td>
            <td><input type="text" value=1></td>
            <td>1966</td>
            <td>1966</td>
        </tr>
        <tr>
            <td>Espanha</td>
            <td><input type="text" value=1></td>
            <td>2010</td>
            <td>2010</td>
        </tr>
        <tr>
            <td>França</td>
            <td><input type="text" value=1></td>
            <td>1998</td>
            <td>2018</td>
        </tr>
    </table>
</body>

</html>
```

A ideia aqui é a seguinte:

1 - Percorrer todos os campos e imprimir seus valores no console.   
2 - Buscar a linha que tenha o país França e na coluna de títulos, alterar o valor de 1 para 2.  
3 - Verificar qual o país que tenha mais títulos e imprimir no console.  

Simples?

Bora codar. Tente sozinho e após você conferir a minha solução aqui: <em breve>