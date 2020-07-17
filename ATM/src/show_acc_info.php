<?php

    $host_acc = $_POST['acc_num'];
    
    $link = mysql_connect("localhost","hozzi","adgjm9654");
    mysql_query("SET NAMES uft8");
    mysql_select_db("hozzi",$link) or die("wrong db");
    
    
    
   $qry_result = mysql_query("select * from ATM_user_acc_info 
        where host_acc_num = '$host_acc'",$link);
  
   $result = null;
   if($qry_result){       
       $member_data = array();
       
       while($qry_row = mysql_fetch_array($qry_result)){
           $data = array('host_acc_num'=>$qry_row['host_acc_num'],
                         'host_name' => $qry_row['host_name'],
                         'client_acc_num'=>$qry_row['client_acc_num'],
                         'client_name'=>$qry_row['client_name'],
                         'transfer_money'=>$qry_row['transfer_money'],
                         'total_money'=>$qry_row['total_money'],
           );
           array_push($member_data, $data);
       }
       $result = array('result'=>ok ,'acc_infos' =>$member_data);
   }else{
       $result = array('result'=>nk);
   }
   
   echo json_encode($result);
   
  
   mysql_close($link);
   

?>