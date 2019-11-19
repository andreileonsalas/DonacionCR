window.repositoryObject = {"columns_custom_fields":[],"relations_custom_fields":[],"unique_keys_custom_fields":[],"triggers_custom_fields":[],"object_id":"t3694","name":"public.Medicamento","subtype":"TABLE","is_user_defined":false,"description":null,"summary":[{"field":"Documentation","value":{"_type":"link","name":"DonacionCR@donacioncr.cniwktixn0zn.us-west-1.rds.amazonaws.com","id":"d4"}},{"field":"Schema","value":"public"},{"field":"Name","value":"Medicamento"}],"columns":[{"id":"column-33599","object_id":"column-33599","name":"Codigo","description":null,"is_pk":false,"is_identity":false,"data_type":"integer","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":"nextval('\"Medicamento_Codigo_seq\"'::regclass)","is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33600","object_id":"column-33600","name":"Nombre","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]},{"id":"column-33601","object_id":"column-33601","name":"Descripcion","description":null,"is_pk":false,"is_identity":false,"data_type":"text","data_length":null,"is_nullable":false,"computed_formula":null,"default_value":null,"is_user_defined":false,"custom_fields":{},"linked_terms":null,"references":[]}],"relations":[{"name":"rel_medicamento","title":null,"description":null,"is_user_defined":false,"foreign_table":"public.Registro_Medicamento","foreign_table_verbose":"public.Registro_Medicamento","foreign_table_object_id":"t3697","primary_table":"public.Medicamento","primary_table_verbose":"public.Medicamento","primary_table_object_id":"t3694","pk_cardinality":"1x","fk_cardinality":"mx","constraints":[{"primary_column":"Codigo","foreign_column":"codigo_medicamento"}],"custom_fields":{}}],"unique_keys":[{"name":"Medicamento_pkey","description":null,"is_pk":true,"is_user_defined":false,"columns":["Codigo"],"custom_fields":{}},{"name":"Medicamento_Nombre_key","description":null,"is_pk":false,"is_user_defined":false,"columns":["Nombre"],"custom_fields":{}},{"name":"unique_code","description":null,"is_pk":false,"is_user_defined":false,"columns":["Codigo"],"custom_fields":{}}],"triggers":[],"dependencies":{"uses":[],"used_by":[{"object_name":"public.Medicamento","object_type":"TABLE","object_id":"t3694","type":"NORMAL","object_user_defined":false,"user_defined":false,"children":[{"object_name":"public.Registro_Medicamento","object_type":"TABLE","object_id":"t3697","type":"RELATION","pk_cardinality":"1x","fk_cardinality":"mx","object_user_defined":false,"user_defined":false,"children":[]}]}]},"imported_at":"2019-11-19 15:40"};