var config = {
   entry: './ui/js/main.js',
	
   output: {
      filename: './ui/js/index.js'
   },
	
   devServer: {
      inline: true,
      historyApiFallback: true,
      port: 8091
   },
	
   module: {
      loaders: [
         {
            test: /\.jsx?$/,
            exclude: /node_modules/,
            loader: 'babel-loader',
				
            query: {
               presets: ['es2015', 'react']
            }
         },{
        	 test: /\.css$/,
        	 use: [{

            	 loader:'style-loader'
        	 }, {

            	 loader:'css-loader',
            	 options:{
            		 modules: true
            	 }
        	 }]
        },{
            test: /\.(jpe?g|png|gif|svg)$/i,
            use: [
              'url-loader?limit=100000',
              'img-loader'
            ]
          }
      ]
   }
}

module.exports = config;