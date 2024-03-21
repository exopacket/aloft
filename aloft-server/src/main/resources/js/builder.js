const path = require("path");
const pkg = require(path.resolve("package.json"));

const external = [
    ...Object.keys(pkg.dependencies || {}),
    ...Object.keys(pkg.peerDependencies || {}),
];

// ESM
require('esbuild').buildSync({
    entryPoints: ['main.js'],
    bundle: true,
    minify: false,
    keepNames: true,
    sourcemap: false,
    outfile: 'aloft.bundle.js',
});
