//@ts-nocheck


import { defineConfig } from 'vite';

import react from '@vitejs/plugin-react-swc'; 
import federation from '@originjs/vite-plugin-federation'; 


const PORT = 5173;

export default defineConfig({
  plugins: [
    
    react(),

   
    federation({ 
      name: 'reactRemote', 
      filename: 'remoteEntry.js', 
      
 
      exposes: {
        './SignLanguageModule': './src/components/SignLanguageComponent.tsx', 
        './QuizModule': './src/components/QuizComponent.tsx',                 
        './ModuleBridge': './src/utils/module-bridge.ts',                   
      },
      

      shared: ['react', 'react-dom'],
 
       shared: {
         'react': { singleton: true, requiredVersion: '^19.0.0' },
        'react-dom': { singleton: true, requiredVersion: '^19.0.0' }
       }
    }),
  ],

  server: {
    port: PORT,
  },

  build: {
    
    target: 'esnext',
    minify: false, 
  }
});