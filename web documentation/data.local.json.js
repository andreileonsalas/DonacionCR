window.repository = {"title": "DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com web","license": "trial","exported_at": "2019-11-19 09:42","structure": [{"id": "d4","object_id": "d4","type": "documentation","name": "DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","subtype": null,"is_user_defined": false,"children": [{"id": "d4t","object_id": "d4t","type": "tables","name": "Tables","subtype": null,"is_user_defined": false,"children": [{"id": "t3692","object_id": "t3692","type": "table","name": "public.Donante","subtype": "TABLE","is_user_defined": false,"columns": ["num_cedula","apellido_1","apellido_2","nombre","sexo","fecha_nacimiento","tipo_sangre","numTelefono","litros_donados","provincia","dir_exacta"],},{"id": "t3693","object_id": "t3693","type": "table","name": "public.Enfermedad","subtype": "TABLE","is_user_defined": false,"columns": ["Codigo","Descripcion","Nombre"],},{"id": "t3694","object_id": "t3694","type": "table","name": "public.Medicamento","subtype": "TABLE","is_user_defined": false,"columns": ["Codigo","Nombre","Descripcion"],},{"id": "t3695","object_id": "t3695","type": "table","name": "public.Registro_Donacion","subtype": "TABLE","is_user_defined": false,"columns": ["num_donacion","cedula_donante","cant_donada","fecha_donacion"],},{"id": "t3696","object_id": "t3696","type": "table","name": "public.Registro_Enfermedad","subtype": "TABLE","is_user_defined": false,"columns": ["numControl","cedulaDonador","anoPadecido","seriedad","nombre_enfermedad"],},{"id": "t3697","object_id": "t3697","type": "table","name": "public.Registro_Medicamento","subtype": "TABLE","is_user_defined": false,"columns": ["control_med","cedula_donador","codigo_medicamento","fecha_inicio"],},]},{"id": "d4f","object_id": "d4f","type": "functions","name": "Functions","subtype": null,"is_user_defined": false,"children": [{"id": "f132","object_id": "f132","type": "function","name": "public.fn_actlitros","subtype": "FUNCTION","is_user_defined": false,},]},]},],"objects": {"d4": {"object_id":"d4","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","description":null,"summary":[{"field":"Host","value":"donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com"},{"field":"Database","value":"DonacionCR"},{"field":"DBMS","value":"PostgreSQL"}],"modules":[],"dbObjects":[{"count":6,"id":"d4t","name":"Tables"},{"count":1,"id":"d4f","name":"Functions"}]},"d4t": {"title_prefix":null,"custom_fields":[],"tables":[{"id":"t3692","name":"public.Donante","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}},{"id":"t3693","name":"public.Enfermedad","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}},{"id":"t3694","name":"public.Medicamento","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}},{"id":"t3695","name":"public.Registro_Donacion","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}},{"id":"t3696","name":"public.Registro_Enfermedad","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}},{"id":"t3697","name":"public.Registro_Medicamento","type":"TABLE","subtype":"TABLE","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}}],"object_id":"d4t"},"t3694": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3694","name":"public.Medicamento","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Medicamento"}],"columns":[{"id":"column-33599","object_id":"column-33599","name":"Codigo","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Medicamento_Codigo_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33600","object_id":"column-33600","name":"Nombre","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33601","object_id":"column-33601","name":"Descripcion","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_medicamento","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Medicamento","foreign_table_verbose":"public.Registro_Medicamento","foreign_table_object_id":"t3697","primary_table":"public.Medicamento","primary_table_verbose":"public.Medicamento","primary_table_object_id":"t3694","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"Codigo","foreign_column":"codigo_medicamento"}],"custom_fields":{}}],"unique_keys":[{"name":"Medicamento_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["Codigo"],"custom_fields":{}},{"name":"Medicamento_Nombre_key","description":null,"is_pk":false,"is_user_defined":false,"columns":["Nombre"],"custom_fields":{}},{"name":"unique_code","description":null,"is_pk":false,"is_user_defined":false,"columns":["Codigo"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[],"used_by":[{"object_name":"public.Medicamento","object_type":"TABLE","object_id":"t3694","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Registro_Medicamento","object_type":"TABLE","object_id":"t3697","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}]},"imported_at":"2019-11-19 15:40"},"t3692": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3692","name":"public.Donante","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Donante"}],"columns":[{"id":"column-33585","object_id":"column-33585","name":"num_cedula","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33586","object_id":"column-33586","name":"apellido_1","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33587","object_id":"column-33587","name":"apellido_2","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33588","object_id":"column-33588","name":"nombre","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33589","object_id":"column-33589","name":"sexo","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33590","object_id":"column-33590","name":"fecha_nacimiento","description":null,"is_pk":false,"is_identity":false,"data_type":"date","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33591","object_id":"column-33591","name":"tipo_sangre","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33592","object_id":"column-33592","name":"numTelefono","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33593","object_id":"column-33593","name":"litros_donados","description":null,"is_pk":false,"is_identity":false,"data_type":"numeric","data_length":"4, 2","is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33594","object_id":"column-33594","name":"provincia","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33595","object_id":"column-33595","name":"dir_exacta","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_donante","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Donacion","foreign_table_verbose":"public.Registro_Donacion","foreign_table_object_id":"t3695","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedula_donante"}],"custom_fields":{}},{"name":"rel_donante","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Enfermedad","foreign_table_verbose":"public.Registro_Enfermedad","foreign_table_object_id":"t3696","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedulaDonador"}],"custom_fields":{}},{"name":"rel_paciente","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Medicamento","foreign_table_verbose":"public.Registro_Medicamento","foreign_table_object_id":"t3697","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedula_donador"}],"custom_fields":{}}],"unique_keys":[{"name":"Donante_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["num_cedula"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[],"used_by":[{"object_name":"public.Donante","object_type":"TABLE","object_id":"t3692","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Registro_Donacion","object_type":"TABLE","object_id":"t3695","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]},{"object_name":"public.Registro_Enfermedad","object_type":"TABLE","object_id":"t3696","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]},{"object_name":"public.Registro_Medicamento","object_type":"TABLE","object_id":"t3697","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}]},"imported_at":"2019-11-19 15:40"},"t3696": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3696","name":"public.Registro_Enfermedad","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Registro_Enfermedad"}],"columns":[{"id":"column-33606","object_id":"column-33606","name":"numControl","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Registro_Enfermedad_#_control_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33607","object_id":"column-33607","name":"cedulaDonador","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[{"id":"t3692","name":"public.Donante"}]},{"id":"column-33608","object_id":"column-33608","name":"anoPadecido","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33609","object_id":"column-33609","name":"seriedad","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33610","object_id":"column-33610","name":"nombre_enfermedad","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[{"id":"t3693","name":"public.Enfermedad"}]}],"relations":[{"name":"rel_donante","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Enfermedad","foreign_table_verbose":"public.Registro_Enfermedad","foreign_table_object_id":"t3696","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedulaDonador"}],"custom_fields":{}},{"name":"rel_enfermedad","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Enfermedad","foreign_table_verbose":"public.Registro_Enfermedad","foreign_table_object_id":"t3696","primary_table":"public.Enfermedad","primary_table_verbose":"public.Enfermedad","primary_table_object_id":"t3693","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"Nombre","foreign_column":"nombre_enfermedad"}],"custom_fields":{}}],"unique_keys":[{"name":"Registro_Enfermedad_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["numControl"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[{"object_name":"public.Registro_Enfermedad","object_type":"TABLE","object_id":"t3696","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Donante","object_type":"TABLE","object_id":"t3692","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]},{"object_name":"public.Enfermedad","object_type":"TABLE","object_id":"t3693","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}],"used_by":[]},"imported_at":"2019-11-19 15:40"},"f132": {"parameters_custom_fields":[],"object_id":"f132","name":"public.fn_actlitros","subtype":"FUNCTION","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"fn_actlitros"}],"script":"CREATE OR REPLACE FUNCTION public.fn_actlitros()\r\n RETURNS trigger\r\n LANGUAGE plpgsql\r\nAS $function$\r\nBEGIN\r\n    UPDATE \"Donante\"\r\n        --table2(id,name)\r\n        --VALUES(new.id,new.name);\r\n\t\t--new.cant_donada\r\n\t\tSET litros_donados = litros_donados + new.cant_donada\r\n\t\tWHERE num_cedula = new.cedula_donante;\r\n\r\n           RETURN new;\r\nEND;\r\n$function$","parameters":[{"name":"Returns","description":null,"mode":"OUT","data_type":"trigger","custom_fields":{}}],"dependencies":{"uses":[],"used_by":[]},"imported_at":"2019-11-19 15:40"},"t3693": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3693","name":"public.Enfermedad","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Enfermedad"}],"columns":[{"id":"column-33596","object_id":"column-33596","name":"Codigo","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Enfermedad_Codigo_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33597","object_id":"column-33597","name":"Descripcion","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33598","object_id":"column-33598","name":"Nombre","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_enfermedad","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Enfermedad","foreign_table_verbose":"public.Registro_Enfermedad","foreign_table_object_id":"t3696","primary_table":"public.Enfermedad","primary_table_verbose":"public.Enfermedad","primary_table_object_id":"t3693","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"Nombre","foreign_column":"nombre_enfermedad"}],"custom_fields":{}}],"unique_keys":[{"name":"Enfermedad_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["Nombre"],"custom_fields":{}},{"name":"unic_code","description":null,"is_pk":false,"is_user_defined":false,"columns":["Codigo"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[],"used_by":[{"object_name":"public.Enfermedad","object_type":"TABLE","object_id":"t3693","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Registro_Enfermedad","object_type":"TABLE","object_id":"t3696","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}]},"imported_at":"2019-11-19 15:40"},"t3695": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3695","name":"public.Registro_Donacion","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Registro_Donacion"}],"columns":[{"id":"column-33602","object_id":"column-33602","name":"num_donacion","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Registro_Donacion_num_donacion_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33603","object_id":"column-33603","name":"cedula_donante","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[{"id":"t3692","name":"public.Donante"}]},{"id":"column-33604","object_id":"column-33604","name":"cant_donada","description":null,"is_pk":false,"is_identity":false,"data_type":"numeric","data_length":"4, 2","is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33605","object_id":"column-33605","name":"fecha_donacion","description":null,"is_pk":false,"is_identity":false,"data_type":"date","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_donante","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Donacion","foreign_table_verbose":"public.Registro_Donacion","foreign_table_object_id":"t3695","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedula_donante"}],"custom_fields":{}}],"unique_keys":[{"name":"Registro_Donacion_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["num_donacion"],"custom_fields":{}}],"triggers":[{"name":"trig_actlitros","description":null,"action":"After Insert ","script":"EXECUTE PROCEDURE fn_actlitros()","custom_fields":{}}],"dependencies":{"uses":[{"object_name":"public.Registro_Donacion","object_type":"TABLE","object_id":"t3695","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Donante","object_type":"TABLE","object_id":"t3692","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]},{"object_name":"public.trig_actlitros","object_type":"TRIGGER","object_id":"t3695","type":"TRIGGER","object_user_defined":false,"user_defined":false,"children":[]}],"used_by":[]},"imported_at":"2019-11-19 15:40"},"t3697": {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3697","name":"public.Registro_Medicamento","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Registro_Medicamento"}],"columns":[{"id":"column-33611","object_id":"column-33611","name":"control_med","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Registro_Medicamento_#_control_med_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33612","object_id":"column-33612","name":"cedula_donador","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[{"id":"t3692","name":"public.Donante"}]},{"id":"column-33613","object_id":"column-33613","name":"codigo_medicamento","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[{"id":"t3694","name":"public.Medicamento"}]},{"id":"column-33614","object_id":"column-33614","name":"fecha_inicio","description":null,"is_pk":false,"is_identity":false,"data_type":"date","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_paciente","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Medicamento","foreign_table_verbose":"public.Registro_Medicamento","foreign_table_object_id":"t3697","primary_table":"public.Donante","primary_table_verbose":"public.Donante","primary_table_object_id":"t3692","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"num_cedula","foreign_column":"cedula_donador"}],"custom_fields":{}},{"name":"rel_medicamento","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Medicamento","foreign_table_verbose":"public.Registro_Medicamento","foreign_table_object_id":"t3697","primary_table":"public.Medicamento","primary_table_verbose":"public.Medicamento","primary_table_object_id":"t3694","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"Codigo","foreign_column":"codigo_medicamento"}],"custom_fields":{}}],"unique_keys":[{"name":"Registro_Medicamento_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["control_med"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[{"object_name":"public.Registro_Medicamento","object_type":"TABLE","object_id":"t3697","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Donante","object_type":"TABLE","object_id":"t3692","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]},{"object_name":"public.Medicamento","object_type":"TABLE","object_id":"t3694","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}],"used_by":[]},"imported_at":"2019-11-19 15:40"},"d4f": {"title_prefix":null,"custom_fields":[],"functions":[{"id":"f132","name":"public.fn_actlitros","type":"FUNCTION","subtype":"FUNCTION","is_user_defined":false,"custom_fields":{"Status":{"value":null,"type":"LIST_CLOSED"}}}],"object_id":"d4f"},}};