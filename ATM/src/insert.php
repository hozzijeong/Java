<?php

    $data1 = $_POST['eng'];
    $data2 = $_POST['kor'];
    $user_idx = $_POST['user_idx'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");
    
    mysql_select_db("hozzi",$link) or die("you choose wrong one");    
    
    mysql_query("insert into whole_word_list(user_idx,eng,kor) VALUES('$user_idx','$data1','$data2')");
    
    mysql_close($link);

    $result = array('result' => ok);

    echo json_encode($result);

?>