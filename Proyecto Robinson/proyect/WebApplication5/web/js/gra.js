


                       
                       

			
                /* $("#acordeon ul li").click(function(){
                       
                   
                     
                      graficaMensual();
                         
                  })    */     
                        var leerXML;
                        if(window.XMLHttpRequest)
                            {
                                leerXML=new XMLHttpRequest();
                               
                            }
                        else{
                            leerXML=new ActiveXObject("Microsoft.XMLHTTP");
                            
                        }
                             leerXML.open("get","xml/erick.xml",false); 
                       // leerXML.load("erick.xml");
                        leerXML.send();
                        
                        miXML=leerXML.responseXML;
                        
                      var n= miXML.getFirstChild().getNodeValue();
                       alert(n);
                       function grafica(){
                           
                       
                        
                        
                       
                            
			//<!--empiezo a realizar la lectura del xml-->
                       
                      
                     
                         var nav= miXML.getElementsByTagName("tipo");
                          
                      
                        IESS=parseInt(nav[0].getElementsByTagName("IESS")[0].childNodes[0].nodeValue);
                        IR=parseInt(nav[0].getElementsByTagName("IR")[0].childNodes[0].nodeValue); 
                        otros=parseInt(nav[0].getElementsByTagName("otros")[0].childNodes[0].nodeValue);
                        
                   
                          
                        
					chart = new Highcharts.Chart({   
								chart: {   
									renderTo: 'ahora',   
									plotBackgroundColor: null,   
									plotBorderWidth: null,   
									plotShadow: false 
								},   
								title: {   
									text: "gastos del anio 2009"   
								},   
								tooltip: {   
									formatter: function() {   
										return '<b>'+ this.point.name +'</b>: '+ this.y +' %';   
									}   
								},   
								plotOptions: {   
									pie: {   
										allowPointSelect: true,   
									  cursor: 'pointer',   
										dataLabels: {   
											enabled: false   
										},   
										showInLegend: true   
									}   
								},   
								series: [{   
									type: 'pie',   
									name: 'Browser share',   
									data: [   
										['IESS',  IESS],   
										['IR',       IR],   
									   {   
											name: 'otros',       
											y: otros,   
											sliced: true,   
											selected: true   
										},   
										
									]   
								}]   
							}); }
                       
                                                        
                        /*
                        function graficaTipoGastos(){
                          var nav= miXML.getElementsByTagName("anios");
                            
                        anio2009=parseInt(nav[0].getElementsByTagName("anio2009")[0].childNodes[0].nodeValue);
                         
                        anio2010=parseInt(nav[0].getElementsByTagName("anio2010")[0].childNodes[0].nodeValue);
                       
                        anio2011=parseInt(nav[0].getElementsByTagName("anio2011")[0].childNodes[0].nodeValue); 
                        
                        
                        chart = new Highcharts.Chart({   
								chart: {   
									renderTo: 'ahora',   
									plotBackgroundColor: null,   
									plotBorderWidth: null,   
									plotShadow: false 
								},   
								title: {   
									text: 'gastos anuales '   
								},   
								tooltip: {   
									formatter: function() {   
										return '<b>'+ this.point.name +'</b>: '+ this.y +' %';   
									}   
								},   
								plotOptions: {   
									pie: {   
										allowPointSelect: true,   
									  cursor: 'pointer',   
										dataLabels: {   
											enabled: false   
										},   
										showInLegend: true   
									}   
								},   
								series: [{   
									type: 'pie',   
									name: 'Browser share',   
									data: [   
										['anio2009',  anio2009],   
										['anio2010',       anio2010],   
									   {   
											name: 'anio2011',       
											y: anio2011,   
											sliced: true,   
											selected: true   
										},   
										
								 
									
									]   
								}]   
							}); */
                        
                      
							
             