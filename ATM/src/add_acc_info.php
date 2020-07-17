<?php

    $user_id = $_POST['user_id'];
    $pass = $_POST['pass'];
    $name = $_POST['name'];
    $acc_num = $_POST['acc_num'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    mysql_query("insert into 
        ATM_user_list(id,pw,name,acc_num) 
        values('$user_id','$pass','$name','$acc_num')");

    $result = array("result"=> ok,"msg"=>"welcome");
    echo json_encode($result);
       
    mysql_close($link);

?>
