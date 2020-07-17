<?php 
    $post_data = $_POST['user_id'];
    $post_data2 = $_POST['pass'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES utf8");
    
    mysql_select_db("hozzi",$link) or die("you choose wrong one");
    
    $total =  mysql_fetch_array(mysql_query("select count(*) FROM user_info_word_list 
        WHERE user_id ='$post_data' And pass = '$post_data2'"));
    $total = $total["count(*)"];
    
    $result = null;
 
    if($total != 1){
        $result = array('result' => NK, 'msg'=> $total);
        
    }else {
        $qry_result =  mysql_query("select * from user_info_word_list where user_id = '$post_data' and pass = '$post_data2'",$link);	
	   
        while($qry_row = mysql_fetch_array($qry_result))
        {
            $user_idx = $qry_row["idx"];
        }

        $result = array('result' => OK,'user_idx' => $user_idx );
    }
 
    echo json_encode($result);
    
 
    mysql_close($link);
    
    
?>