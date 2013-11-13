package webapp.db;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import webapp.WebApp;
import webapp.WebappPackage;

public class WebAppSerializer {
        public WebApp load(File f) {
            ResourceSet rs = new ResourceSetImpl(); 
            Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
            Map<String,Object> m = registry.getExtensionToFactoryMap();
            m.put("xmi", new XMIResourceFactoryImpl());
            rs.getPackageRegistry().put(WebappPackage.eNS_URI, WebappPackage.eINSTANCE);
            URI uri = URI.createFileURI(f.getAbsolutePath());
            Resource resource = rs.getResource(uri, true);
            
            if (resource.isLoaded() && resource.getContents().size() > 0) {
              return (WebApp) resource.getContents().get(0);
            }
            return null;
          }
        
        public void save(WebApp webApp, File f) {
            ResourceSet rs = new ResourceSetImpl();
            Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
            Map<String,Object> m = registry.getExtensionToFactoryMap();
            m.put("xmi", new XMIResourceFactoryImpl());
            m.put("ecore", new EcoreResourceFactoryImpl());
            rs.getPackageRegistry().put(WebappPackage.eNS_URI, WebappPackage.eINSTANCE);
            Resource packageResource = rs.createResource(URI.createFileURI("WebApp.ecore"));
            packageResource.getContents().add(WebappPackage.eINSTANCE);
            try { 
              packageResource.load(null); 
            } catch (IOException e1) { 
              e1.printStackTrace(); 
            }
            URI uri = URI.createFileURI(f.getAbsolutePath());
            Resource resource = rs.createResource(uri);
            resource.getContents().add(webApp);
            try {
              HashMap<String, Boolean> options = new HashMap<String, Boolean>();
              options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
              resource.save(options);
            } catch (IOException e) { e.printStackTrace(); }
          }
}