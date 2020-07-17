<?php
    
    $user_acc = $_POST['acc_num'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    
    $total=mysql_fetch_array(mysql_query("select count(*) from ATM_user_list
            where acc_num ='$user_acc'"));
    $total = $total["count(*)"];
    
    if($total == 0){
        $result = 'OK';
        echo json_encode($result);
        
    }else{
        $result = 'NK';
        echo json_encode($result);
    }
    
    
    
    mysql_close($link);

?>