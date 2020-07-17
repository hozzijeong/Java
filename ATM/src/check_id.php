<?php

    $user_id = $_POST['user_id'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    
    $total=mysql_fetch_array(mysql_query("select count(*) from ATM_user_list 
        where id ='$user_id'"));
    $total = $total["count(*)"];
    
    if($total == 0){
        $result = array("result" => OK,"msg"=>Good);
            
    }else{
        $result = array("result" => NK,"msg"=>Good);
        
    }
    echo json_encode($result);
    
    
    mysql_close($link);
    
?>