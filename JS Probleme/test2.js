//Beispiel einer typischen Webpack-Konfiguration (webpack.config.js)
module.exports = {
    entry: './src/index.js',
    output: {
      filename: 'bundle.js',
      path: __dirname + '/dist'
    },
    module: {
      rules: [
        {
          test: /\.js$/,
          exclude: /node_modules/,
          use: {
            loader: 'babel-loader',
            options: {
              presets: ['@babel/preset-env']
            }
          }
        }
      ]
    }
  };
  
  //Problem: Hier müssen viele Konfigurationen vorgenommen werden, 
  // um Webpack und Babel richtig einzuführen. 
  // Für ein einfaches Projekt kann dies schnell überwältigend werden und zu Fehlern führen, 
  // wenn nicht alle Details korrekt konfiguriert sind.