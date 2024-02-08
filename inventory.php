<?php
	/*
		IMPORTANT NOTE:
		- create a folder name "inventory" inside htdocs and paste this file. 
	*/
session_start();

$host = "localhost";
$user = "root";
$pw = "";
$database = "inventory";

$connection = mysqli_connect($host, $user, $pw) or die(mysqli_error($connection));
mysqli_select_db($connection, $database) or die(mysqli_error($connection));
// mysqli_query($con,"SET CHARACTER SET utf8");
// mysqli_query($con,"SET NAMES 'utf8'");
error_reporting(E_ALL);
ini_set('display_errors', 1);
$itemclicked = "";

$action = $_GET["action"];
switch ($action) {

	case "CountItem":
		$q = mysqli_query($connection, "SELECT * FROM `item_table`");
		$count = mysqli_num_rows($q);
		print json_encode($count);
		break;

	case "CountSupplier":
		$q = mysqli_query($connection, "SELECT * FROM `suplier_table`");
		$count = mysqli_num_rows($q);
		print json_encode($count);
		break;

	case "GetItem":
		$q = mysqli_query($connection, "SELECT * FROM `item_table`");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}
		print json_encode($rows);
		break;

	case "GetSupplier":
		$q = mysqli_query($connection, "SELECT * FROM `suplier_table`");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}

		print json_encode($rows);
		break;

	case "GetSupplierMain":
		$q = mysqli_query($connection, "SELECT * FROM `suplier_table`");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}

		print json_encode($rows);
		break;

		// case "GetTotalCost":
		// 	$q = mysqli_query($connect, "SELECT TotalCost FROM `inventory_table`");
		// 	$rows = array();
		// 	while ($r = mysqli_fetch_assoc($q)) {
		// 		$rows[] = $r;
		// 	}
		// 	print json_encode($rows);
		// 	break;

		// case "SearchItem":
		// 	$q = mysqli_query($connect, "SELECT * FROM `inventory_table`");
		// 	$rows = array();
		// 	while ($r = mysqli_fetch_assoc($q)) {
		// 		$rows[] = $r;
		// 	}
		// 	print json_encode($rows);
		// 	break;

	case "InsertNewSupp":

		$supplier_name = $_GET["supplier_name"];
		$supplier_address = $_GET["supplier_address"];
		$supplier_tin = $_GET["supplier_tin"];
		$supplier_pno = $_GET["supplier_pno"];
		$supplier_date = $_GET["supplier_date"];
		$supplier_mop = $_GET["supplier_mop"];
		$supplier_PoD = $_GET["supplier_PoD"];
		$supplier_DoD = $_GET["supplier_DoD"];
		$supplier_DT = $_GET["supplier_DT"];
		$supplier_PT = $_GET["supplier_PT"];


		$stmt = $connection->prepare("INSERT INTO `suplier_table` (`supplier_name`, `supplier_address`, `supplier_tin`,
																`supplier_pno`,`supplier_date`,`supplier_mop`,
																`supplier_PoD`,`supplier_DoD`,`supplier_DT`,`supplier_PT`)
														VALUES (?,?,?,?,?,?,?,?,?,?)");
		if (!$stmt) {
			die("Prepare failed: " . $connection->error);
		}
		$stmt->bind_param(
			"ssisssssss",
			$supplier_name,
			$supplier_address,
			$supplier_tin,
			$supplier_pno,
			$supplier_date,
			$supplier_mop,
			$supplier_PoD,
			$supplier_DoD,
			$supplier_DT,
			$supplier_PT
		);
		$stmt->execute();
		print json_encode("Inserted");

		$stmt->close();
		$connection->close();
		break;

	case "UpdateExistingSupp":

		$fetchdata = $_GET["updateSupplier"];

		$supplier_name = $_GET["supplier_name"];
		$supplier_address = $_GET["supplier_address"];
		$supplier_tin = $_GET["supplier_tin"];
		$supplier_pno = $_GET["supplier_pno"];
		$supplier_date = $_GET["supplier_date"];
		$supplier_mop = $_GET["supplier_mop"];
		$supplier_PoD = $_GET["supplier_PoD"];
		$supplier_DoD = $_GET["supplier_DoD"];
		$supplier_DT = $_GET["supplier_DT"];
		$supplier_PT = $_GET["supplier_PT"];

		$stmt = $connection->prepare("UPDATE `suplier_table` SET `supplier_name` = ?, `supplier_address` = ?, `supplier_tin` = ?, `supplier_pno` = ?,
		 `supplier_date` = ?, `supplier_mop` = ?, `supplier_PoD` = ?, `supplier_DoD` = ?, `supplier_DT` = ?, `supplier_PT` = ? WHERE `supplier_name` = ?");
		$stmt->bind_param("sssssssssss", $supplier_name, $supplier_address, $supplier_tin, $supplier_pno, $supplier_date, 
			$supplier_mop, $supplier_PoD, $supplier_DoD, $supplier_DT, $supplier_PT, $fetchdata);

		$stmt->execute();

		if ($stmt->execute()) {
			echo "Record updated successfully";
			print json_encode("Updated");
		} else {
			echo "Error updating record: " . $stmt->error;
		}
		$stmt->close();
		$connection->close();
		break;

	case "ViewSupplier":

		$itemclicked = $_GET["passedSupplier"];

		$q = mysqli_query($connection, "SELECT * FROM `suplier_table` WHERE `supplier_name` = '$itemclicked'");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}
		print json_encode($rows);
		break;

	case "DeleteSupplier":

		$itemclicked = $_GET["passedSupplierDelete"];

		$q = $connection->prepare("DELETE FROM `suplier_table` WHERE `supplier_name` = ?");

		if (!$q) {
			die("Error in preparing the statement: " . $connection->error);
		}
		$q->bind_param("s", $itemclicked);
		$q->execute();
		// Execute the statement and check for errors
		if ($q->execute()) {
			echo "Record deleted successfully";
		} else {
			echo "Error deleting record: " . $q->error;
		}

		print json_encode($q);

		$q->close();
		$connection->close();
		break;

	case "InsertNewItem":

		$suplier_ID = $_SESSION["supplierID"];
		$supplier = $_GET["supplier"];
		$itemName = $_GET["item_name"];
		$Description = $_GET["item_description"];
		$ItemNo = $_GET["item_no"];
		$item_unit = $_GET["item_unit"];
		$item_quantity = $_GET["item_quantity"];
		$item_unitcost = $_GET["item_unitcost"];
		$TotalCostItem = $_GET["item_totalcost"];
		$fetchedID = "";
		$q = mysqli_query($connection, "SELECT * FROM `suplier_table` WHERE `supplier_name` = '$supplier'");

		// Check if the query returned any results
		if ($q) {
			$fetchID = mysqli_fetch_assoc($q);

			// Check if a row was fetched
			if ($fetchID) {
				$fetchedID = $fetchID['id'];
				$_SESSION["supplierID"] = $fetchedID;
			} else {
				// Handle the case when no row is fetched
				// You might want to set a default value or handle it accordingly
				echo "No supplier found for the given name.";
			}
		} else {
			// Handle the case when the query fails
			echo "Error executing the query: " . mysqli_error($connection);
		}

		$stmt = $connection->prepare("INSERT INTO `item_table` (`supplier_id`, `supplier`, `item_name`,
															 `item_description`,`item_no`,`item_unit`,
															 `item_quantity`,`item_unitcost`,`item_totalcost`)
													 VALUES (?,?,?,?,?,?,?,?,?)");
		if (!$stmt) {
			die("Prepare failed: " . $connection->error);
		}
		$stmt->bind_param("sssssssss", $fetchedID, $supplier, $itemName, $Description, $ItemNo, $item_unit, $item_quantity, $item_unitcost, $TotalCostItem);
		$stmt->execute();

		print json_encode("Inserted ID:" & $suplier_ID);
		$stmt->close();
		$connection->close();
		break;

	case "UpdateExistingItem":

		$fetchdata = $_GET["updateData"];

		$supplier = $_GET["supplier"];
		$itemName = $_GET["item_name"];
		$Description = $_GET["item_description"];
		$ItemNo = $_GET["item_no"];
		$item_unit = $_GET["item_unit"];
		$item_quantity = $_GET["item_quantity"];
		$item_unitcost = $_GET["item_unitcost"];
		$TotalCostItem = $_GET["item_totalcost"];


		$stmt = $connection->prepare("UPDATE `item_table` SET `supplier` = ?, `item_name` = ?, `item_description` = ?, `item_no` = ?, `item_unit` = ?, `item_quantity` = ?, `item_unitcost` = ?, `item_totalcost` = ? WHERE `item_name` = ?");
		$stmt->bind_param("sssssssss", $supplier, $itemName, $Description, $ItemNo, $item_unit, $item_quantity, $item_unitcost, $TotalCostItem, $fetchdata);

		$stmt->execute();

		if ($stmt->execute()) {
			echo "Record updated successfully";
			print json_encode("Updated");
		} else {
			echo "Error updating record: " . $stmt->error;
		}
		$stmt->close();
		$connection->close();
		break;

	case "ViewItem":

		$itemclicked = $_GET["passedData"];
		$q = mysqli_query($connection, "SELECT * FROM `item_table` WHERE `item_name` = '$itemclicked'");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}
		print json_encode($rows);
		break;

	case "DeleteItem":

		$itemclicked = $_GET["passedDataDelete"];
		$q = $connection->prepare("DELETE FROM `item_table` WHERE `item_name` = ?");

		if (!$q) {
			die("Error in preparing the statement: " . $connection->error);
		}
		$q->bind_param("s", $itemclicked);
		$q->execute();
		// Execute the statement and check for errors
		if ($q->execute()) {
			echo "Record deleted successfully";
		} else {
			echo "Error deleting record: " . $q->error;
		}

		print json_encode($q);

		$q->close();
		$connection->close();
		break;

	case "SearchedItem":
		$q = mysqli_query($connection, "SELECT * FROM `item_table`");
		$rows = array();
		while ($r = mysqli_fetch_assoc($q)) {
			$rows[] = $r;
		}
		print json_encode($rows);
		break;

		// case "deletetable":
		// 	$q = mysqli_query($connect, "DELETE FROM `inventory_table`");
		// 	print json_encode($rows);
		// 	break;
}
