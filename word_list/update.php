<?php

    $word_idx = $_POST['idx'];
    $eng = $_POST['eng'];
    $kor = $_POST['kor'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");   
    mysql_query("SET NAMES utf8");
    
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    mysql_query("update whole_word_list 
            SET eng = '$eng',kor ='$kor' 
            where idx = '$word_idx'",$link);
    
    $result = array("result" => OK);
    
    echo json_encode($result);
    
    
    mysql_close($link);


?>