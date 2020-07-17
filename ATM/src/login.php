<?php

// 이거 해결하기 :Warning: mysql_fetch_array() expects parameter 1 to be resource,
// boolean given in /home/hozzi12/www/ATM/login.php on line 13
    $user_id = $_POST['user_id'];
    $pass = $_POST['pass'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");   
    mysql_select_db("hozzi",$link) or die("you choose wrong db");
    
    
    $total = mysql_fetch_array(mysql_query("select count(*) from ATM_user_list
        where id = '$user_id' and pw = '$pass'"));
    
    
    $total = $total["count(*)"];
        
    if($total != 1){
        $result = array('result'=> NK,'msg'=>$total);
       
    }else{
        $qry_result = mysql_query("select * from ATM_user_list
            where id = '$user_id' and pw = '$pass'",$link);
        $memberdata = array();
        
        while($qry_row = mysql_fetch_array($qry_result)){
           
            $data = array('name'=>$qry_row["name"],'acc_num'=>$qry_row["acc_num"]);
            array_push($memberdata, $data);     
        }
        
        $result = array('result'=> Ok,'user_data'=>$memberdata);
    }
    
    echo json_encode($result);
    
    mysql_close($link);
    
?>